package bluemountain.web.doctor.statistics;

import bluemountain.pojo.Patient;
import bluemountain.pojo.PatientExam;
import bluemountain.protocol.DepartmentRepository;
import bluemountain.protocol.PatientExamRepository;
import bluemountain.protocol.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by 54472 on 2017/3/22.
 */

@Controller
public class PatientController {

    private PatientRepository patientRepository;
    private PatientExamRepository patientExamRepository;
    private DepartmentRepository departmentRepository;

    @Autowired
    public PatientController(PatientRepository patientRepository, PatientExamRepository patientExamRepository, DepartmentRepository departmentRepository) {
        this.patientRepository = patientRepository;
        this.patientExamRepository = patientExamRepository;
        this.departmentRepository = departmentRepository;
    }

    @RequestMapping(value = "doctor/statistics/patient", method = RequestMethod.GET)
    public String patient(Model model) {
        model.addAttribute("patients", patientRepository.all());
        model.addAttribute("departments", departmentRepository.all());

        return "doctor/statistics/patient";
    }

    @RequestMapping(value = "doctor/statistics/patient", method = RequestMethod.POST)
    public String patient(Model model, String gender, Integer min, Integer max, String department) {
        model.addAttribute("departments", departmentRepository.all());

        System.out.println(gender);
        System.out.println(min);
        System.out.println(max);
        System.out.println(department);

        List<PatientExam> patientExams = patientExamRepository.all();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if (!"".equals(gender)) {
            patientExams = patientExams.stream().filter(exam -> exam.getPatient().getSex().equals(gender)).collect(Collectors.toList());
        }

        if (null != min) {
            patientExams = patientExams.stream().filter(exam -> (currentYear - exam.getPatient().getDateOfBirth().toLocalDate().getYear()) >= min).collect(Collectors.toList());
        }

        if (null != max) {
            patientExams = patientExams.stream().filter(exam -> (currentYear - exam.getPatient().getDateOfBirth().toLocalDate().getYear()) <= max).collect(Collectors.toList());
        }

        if (!"".equals(department)) {
            patientExams = patientExams.stream().filter(exam -> exam.getChecklist().getDepartmentName().equals(department)).collect(Collectors.toList());
        }

        Set<Integer> patientIDs = patientExams.stream().map(exam -> exam.getPatient().getPatientId()).collect(Collectors.toSet());
        List<Patient> patients = patientRepository.all().stream().filter(patient -> patientIDs.contains(patient.getPatientId())).collect(Collectors.toList());
        model.addAttribute("patients", patients);

        return "doctor/statistics/patient";
    }

}

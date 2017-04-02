package bluemountain.protocol;

import bluemountain.pojo.Patient;

/**
 * Created by MainasuK on 2017-3-10.
 */
public interface PatientRepository extends ListRepositoryProtocol<Patient> {
    // Patient counts of database
    int size();
    int quantityOfMale();
    int quantityOfFemale();
    int quantityInRange(int min, int max);
    Patient patientWithId(int id);
}

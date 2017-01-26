#   Project Report:
##  Scope:
-	A doctor is able to access history of the patient anytime and from anywhere. It is basically a remotely accessible clinic. 
-	It will allow pharmaceutical companies to communicate drug safety issues to doctors and patients via pharmacy.
-	A doctor can keep track of the patient’s records stored in the enterprise in which the encounter was held.
-	A Doctor can enquire about the encounter details of the patient from another doctor when in case of an emergency.
-	A patient can discuss about any health related issues with other patients on a public level through the discussion forum.
-	A doctor can refer the patient request to another doctor, if the doctor needs to do so.
-	A patient cannot be registered again once registered by the hospital.

##  Assumptions:
-	A Doctor can work in more than one hospital or clinic.
-	A drug when created, first has to be approved by the FDA.
-	An already referred request cannot be referred further.
-	A referred doctor can close the case of a patient but the primary doctor cannot close the case.
-	Clinic cannot create emergency requests but can respond to the same.
-	A Global authority will register the doctors at a global level.
-	Patients must be registered in a hospital or a clinic before their very first encounter.
-	A patient can be registered only once before any encounter.
-	All the doctors respond to the emergency request sent by a doctor for a patient.
-	Pharmaceutical company broadcasts messages to all the patients, doctors and pharmacies but send call back requests of drug to only those pharmacies which took drugs from this company.

##  Object Model: 


The above object model is based on ecosystem model which consists of multiple classes and follows the factory model pattern. Ecosystem is the topmost class containing the system object derived from the Class organization. 
Ecosystem class contains: 
1.	Global authority which includes:
-   International Food and Drug authority responsible for approving and disapproving drug requests directly sent from pharmaceutical companies.
-   International Classification of Diseases responsible for registering a disease with all its possible symptoms.

2.	 Network class containing the list of countries as group of states which are further a group of cities.

3.  Enterprise is an abstract class extended from Organization which is contained in every city of the network. Enterprise Directory contains Hospitals, clinics, pharmacies, pharmaceutical companies and global authority.

4.  Organization is an abstract class which has user account directory and person directory. Organization Directory contains organization like admin, Doctor, drug management, drug regulatory, ICD, Lab Nurse, Patient, Pharmacy stores.

5.  ICD organization has list of diseases which have their individual forum topics where patients can reply to the forum discussions and also comment on their replies.

6.  Roles class contains the roles of various person participating like admin, global authority, system admin, doctor, drug manager, ICD, IFDA, lab assistant, nurse, patient and pharmaceutical company.

7.  Encounter directory is stored in the enterprise where the particular encounter is performed and each encounter track the various vital signs of the encounter.

8.  Work request is an abstract class where different persons send work requests to be processed.



##  Roles and responsibilities:
####`System Admin Role

1. Manages network which includes creating countries, states and cities.
2. Creates enterprises and their respective admins. 
3. Creates admin for Global Authority.

####    Global Authority Admin

1. Manages doctors and creates doctors. 
2. Creates admin for IFDA. 
3. Creates admin for ICD.

####    International Food and Drug Authority
1. Manages work requests from pharmaceutical company managers.

####    Hospital Enterprise Admin
1. Manages Organization.
2. Manages employee.
3. Manages patients.
4. Creates emergency situations.
5. Responds to emergency requests.

####    Clinic Enterprise Admin
1. Manages Organization.
2. Manages employees.
3. Manages patients.
4. Responds to emergency requests.

####    Lab Assistant Role:
1.	Manage Work Requests from doctor.

####    Pharmacy Company Enterprise Admin
1. Manages Organization.
2. Manages Drugs.
3. Manages pharmacy work requests.
4. Manages Pharmacy Stores.
5. View drug call back requests.
6. Manages broadcast messages received from pharmaceutical Companies.

####    Pharmaceutical Company Enterprise Admin
1. Manages Organization.
2. View my pharmacies.
3. View Drug feedback.
4. Manage employees.
5. Create drug call back request.
6. Create Network communication request for drug call back.

####    Drug Manager Role
1. Manages drug creation and deletion and send request to FDA for approval.
2. Manages Work Request.

####    Doctor Role
1. Manages Patient work request.
2. Manage Lab test results.
3. Manages emergency details.
4. Manages Pharmacy Work request
5. Manage Referral requests.
6. View broadcasts. 
7. View Drug guidelines.
8. Send enquiry over the network.

####    Patient Role: 
1. Manages Doctor work requests.
2. View Pharmacy Work request.
3. View Lab work requests. 
4. *Get Socialize.

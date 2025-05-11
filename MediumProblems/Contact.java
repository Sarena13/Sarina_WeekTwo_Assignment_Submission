/* Simple Contact Management Create a class Contact with fields: name, 
phoneNumber, emailAddress. Create 3 Contact objects. Print the contact 
details only if the emailAddress is not empty (use if condition).*/
public class Contact{
    
    public String name;
    public String phoneNumber;
    public String emailAddress;

    
    public Contact (String name, String num, String email){
        this.name = name;
        this.phoneNumber = num;
        this.emailAddress = email;
    }
     public String emailAdressFound(){
        if( !emailAddress.isEmpty()){
            return emailAddress;
        }else{
            return emailAddress;
        }
     }
     public void contactDetails(){
        if(!emailAddress.isEmpty()){
        System.out.println("Name:" + name);
        System.out.println("phoneNumber:" + phoneNumber);
        System.out.println("emailAddress:" + emailAddress);
        System.out.println("Email:" + emailAdressFound());
        System.out.println();
     }
     }
     public static void main(String[] args){
        Contact c1 = new Contact("sarena", "9834008932", "s112@gmail.com");
        Contact c2 = new Contact("Roshika", "9823459891", "R12@gmail.com");
        Contact c3 = new Contact("sarika", "9854677933", "");
        
        c1.contactDetails();
        c2.contactDetails();
        c3.contactDetails();
     }
}

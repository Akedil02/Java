package Day19;

public class User {
    private String UserName;
    private String Password;
    private String IdNumber;
    private String PhoneNumber;

    public User(String userName, String password, String idNumber, String phoneNumber) {
        UserName = userName;
        Password = password;
        IdNumber = idNumber;
        PhoneNumber = phoneNumber;
    }



    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}

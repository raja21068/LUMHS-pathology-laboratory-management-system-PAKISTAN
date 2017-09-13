/**
 *
 * @author Aahil Mehboob
 */
public class UsersBean {
    
    private int userId;
    private int typeId;
    private int active;
    private String userName;
    private String userPassword;
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public void setActive(int active) {
        this.active = active;
    }
    
    public int getUserId(){
        return this.userId;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getUserPassword(){
        return this.userPassword;
    }
    
    public int getTypeId() {
        return typeId;
    }
    public int getActive() {
        return active;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    
    @Override
    public String toString(){
        return userName;
    }
}

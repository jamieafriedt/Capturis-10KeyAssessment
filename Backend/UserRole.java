
public class UserRole {
    
    private int roleID;
    private String roleName; 
    private String description;

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRoleID() {
        return roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }
    
}

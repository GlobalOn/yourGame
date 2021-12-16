package yourGame.project10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles", schema = "yourgame")
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userroles_id")
    private Integer id;

    @Column(name = "user_role")
    private String role;

    public UserRoles() {
    }

    public UserRoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRoles{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}

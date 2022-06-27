package CPX.Mobile.Backend.demo2.dto;

import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import CPX.Mobile.Backend.demo2.model.userModel;

public interface userDAO {
    
    public List<userModel> getAllUser();
    public userModel getUser();
    public boolean createUser();
    public boolean putUpdateUserById();
    public boolean patchUpdateUserById();
    public boolean deleteUser();
}

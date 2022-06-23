package CPX.Mobile.Backend.demo2.mapper;

import org.mapstruct.Mapper;
import CPX.Mobile.Backend.demo2.dto.UserDto;
import CPX.Mobile.Backend.demo2.model.User;

@Mapper
public interface UserMapper {


    UserDto modelTODto(User user);
    User dtoToUser(UserDto userDto);

}

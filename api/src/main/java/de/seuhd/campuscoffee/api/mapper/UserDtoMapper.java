package de.seuhd.campuscoffee.api.mapper;

import de.seuhd.campuscoffe.api.dtos.UserDto;
import de.seuhd.campus.coffe.domain.model.User;
import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

@Mapper(componentModel = "spring")
@ConditionalOnMissingBean
public interface UserDtoMapper {
    //TODO: Implement user DTO mapper
    UserDto fromDomain(User source);
    User toDomain(UserDto source);
}
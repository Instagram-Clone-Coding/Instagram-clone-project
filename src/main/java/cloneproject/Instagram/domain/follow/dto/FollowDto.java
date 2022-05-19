package cloneproject.Instagram.domain.follow.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.querydsl.core.annotations.QueryProjection;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FollowDto {
    
    public String memberUsername;

    @JsonIgnore
    public String followMemberUsername;

    @QueryProjection
    public FollowDto(String memberUsername, String followMemberUsername){
        this.memberUsername = memberUsername;
        this.followMemberUsername = followMemberUsername;
    }

}
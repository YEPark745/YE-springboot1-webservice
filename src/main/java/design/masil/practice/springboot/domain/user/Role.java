package design.masil.practice.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "Visitor"),
    USER("ROLE_USER", "General user");

    private final String key;
    private final String title;

}
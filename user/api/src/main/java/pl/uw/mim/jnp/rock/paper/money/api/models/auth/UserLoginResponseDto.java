package pl.uw.mim.jnp.rock.paper.money.api.models.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserLoginResponseDto {

  private String token;
}

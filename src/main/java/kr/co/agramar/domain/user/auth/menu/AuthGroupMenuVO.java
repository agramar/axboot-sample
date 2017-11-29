package kr.co.agramar.domain.user.auth.menu;

import kr.co.agramar.domain.program.Program;
import lombok.Data;

import java.util.List;

@Data
public class AuthGroupMenuVO {

    private List<AuthGroupMenu> list;

    private Program program;
}

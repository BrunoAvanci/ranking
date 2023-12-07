package ranking.com.example.ranking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ranking.com.example.ranking.dao.CadastroRepository;
import ranking.com.example.ranking.model.Cadastro;

@Controller
public class RankingController {

    @Autowired
    CadastroRepository cr;

    @GetMapping("/add")
    public String abrir(Cadastro cadastro) {
        return "cadastrar-jogador";
    }

    @PostMapping("/cadastro-jogador")
    public String salvar(Cadastro cadastro) {
        cr.save(cadastro);
        return "index";

    }

}

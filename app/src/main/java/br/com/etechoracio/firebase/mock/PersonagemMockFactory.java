package br.com.etechoracio.firebase.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.etechoracio.firebase.enums.EspecieEnum;
import br.com.etechoracio.firebase.enums.SexoEnum;
import br.com.etechoracio.firebase.enums.StatusEnum;
import br.com.etechoracio.firebase.model.Personagem;

public class PersonagemMockFactory {

    public static List<Personagem> createMockList() {
        List<Personagem> personagens = new ArrayList<>();
        {
            Personagem pers = new Personagem();
            pers.setId("AAAAAA1");
            pers.setNome("Son Goku");
            pers.setApelido("Goku");
            pers.setEspecie(EspecieEnum.ALIENIGENA);
            pers.setSexo(SexoEnum.M);
            pers.setStatus(StatusEnum.VIVO);
            personagens.add(pers);
        }
        {
            Personagem pers = new Personagem();
            pers.setId("AAAAAA2");
            pers.setNome("Número 17");
            pers.setApelido("Número 17");
            pers.setEspecie(EspecieEnum.ANDROIDE);
            pers.setSexo(SexoEnum.M);
            pers.setStatus(StatusEnum.VIVO);
            personagens.add(pers);
        }
        {
            Personagem pers = new Personagem();
            pers.setId("AAAAAA3");
            pers.setNome("Número 18");
            pers.setApelido("Número 18");
            pers.setEspecie(EspecieEnum.ANDROIDE);
            pers.setSexo(SexoEnum.M);
            pers.setStatus(StatusEnum.VIVO);
            personagens.add(pers);
        }
        return personagens;

    }

}

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class ExtratorDeConteudoDaNasa implements ExtratorDeConteudo{
    public List<conteudo> extraiConteudos(String json){
       
        // extrair só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);
        
        List<conteudo> Conteudos = new ArrayList<>();
        
        
        //popular a lista de conteudos
        for (Map<String,String> atributos : listaDeAtributos) {
            String titulo = atributos.get("title");
            String url = atributos.get("url");
            var Conteudo = new conteudo(titulo, url);
            
            Conteudos.add(Conteudo);
            
        }
        return Conteudos;
        
    }

}

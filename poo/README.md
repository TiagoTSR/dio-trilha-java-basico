# Modelando o iphone com UML

```mermaid
classDiagram
    class iPhone {
        - bateria: int
        + tocarMusica()
        + fazerLigacao()
        + navegarNaInternet()
    }

    class Musica {
        - nome: String
        - artista: String
        - duracao: int
    }

    class Contato {
        - nome: String
        - numero: String
    }

    class PaginaWeb {
        - url: String
        - conteudo: String
    }

    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet

    ReprodutorMusical --o Musica
    AparelhoTelefonico --o Contato
    NavegadorInternet --o PaginaWeb

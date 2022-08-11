public class Main {
    public static void main(String[] args) {
        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new Ip(100, 23, 23, 25));

        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso Liberado");
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }
    }
    public static void main() throws SerieNaoHabilitadaException {

        Serie s1 = new Serie("Sandman");
        Serie s2 = new Serie("Castlevania");
        Serie s3 = new Serie("Principe Dragao");


        SerieProxy sp1 = new SerieProxy();
        sp1.setQtdViews(5);
        System.out.println(sp1.getSerie(s1));
        System.out.println(sp1.getQtdViews());

    }
}

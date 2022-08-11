public class Serie implements ISerie {
    private String name;

    public Serie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getSerie(Serie serie) {
        return "www." + serie.getName().replace(" ","") + ".com";
    }

    @Override
    public Serie getSerie(String nomeSerie) throws SerieNaoHabilitadaException {
        return null;
    }

}

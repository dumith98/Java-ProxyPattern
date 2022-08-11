public interface ISerie {
    String getSerie(Serie serie) throws SerieNaoHabilitadaException;

    public Serie getSerie(String nomeSerie) throws SerieNaoHabilitadaException;
}

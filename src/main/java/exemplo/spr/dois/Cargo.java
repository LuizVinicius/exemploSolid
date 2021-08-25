package exemplo.spr.dois;

public enum Cargo {

    DESENVOLVEDOR_SENIOR(new RegraVinteDoisEMeioPorcento()),
    DESENVOLVEDOR_JUNIOR(new RegraOnzePorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }

}

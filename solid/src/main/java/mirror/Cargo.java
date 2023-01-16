package mirror;

public enum Cargo {
    ASSISTENTE {
      @Override
      public Cargo getProximoCargo(){
          return ANALISTA;
      }
    },
    ANALISTA{
        @Override
        public Cargo getProximoCargo(){
            return ESPECIALISTA;
        }
    },
    GERENTE{
        @Override
        public Cargo getProximoCargo(){
            return GERENTE;
        }
    },
    ESPECIALISTA{
        @Override
        public Cargo getProximoCargo(){
            return GERENTE;
        }
    };

    public abstract Cargo getProximoCargo();
}

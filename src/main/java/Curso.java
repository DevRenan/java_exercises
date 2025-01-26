class Curso {
    private String nome;
    private int alunos;
    private String cnpj;
    public Curso(String nome, int alunos, String cnpj) {
        this.nome = nome;
        this.alunos = alunos;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public String getCnpjs() {
        return cnpj;
    }
}
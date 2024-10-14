package model;

public abstract class DadosEntrada {

    private int num;
    private int numPrimeiro;
    private int numSegundo;

    public DadosEntrada (int num, int numPrimeiro, int numSegundo){
        this.num = num;
        this.numPrimeiro = numPrimeiro;
        this.numSegundo = numSegundo;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    public int getNumPrimeiro() {
        return numPrimeiro;
    }



    public void setNumPrimeiro(int numPrimeiro) {
        this.numPrimeiro = numPrimeiro;
    }



    public int getNumSegundo() {
        return numSegundo;
    }



    public void setNumSegundo(int numSegundo) {
        this.numSegundo = numSegundo;
    }
    

    



}

package nlp.universitypreference;

/**
 * Created by Asus on 21.05.2017.
 */
public class RowItem {
    private String uni_name;
    private String compound;
    private String bolum;

    public RowItem(String uni_name , String compound,String bolum){

        this.uni_name = uni_name;
        this.compound = compound;
        this.bolum = bolum;
    }


    public String getUni_name(){return uni_name;}

    public void setUni_name(String uni_name) {this.uni_name = uni_name;}

    public String getCompound(){return compound;}

    public void setCompound(String compound) {this.compound = compound;}

    public String getBolum(){return bolum;}

    public void setBolum(String bolum) {this.bolum = bolum;}

}

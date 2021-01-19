
//Эта программа будет рассчитывать зарплату пекаря Юры


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ProizvoditelnostPekaria {

    double zarplata = 700;
    int NormaZaSmenyvmesjc = 100; // это в булках
    int YsloviePolycheniaPremii = 900;
    boolean value = true;
    String name = "Ura";


    public void RaschetZpSotrydnika() {

        if (YsloviePolycheniaPremii > NormaZaSmenyvmesjc) {
            System.out.println(name + " Сотрудник хорошо работал");
            YsloviePolycheniaPremii++;


        } else {
            System.out.println(name + " Сотрудник плохо работал");
        }
    }

        public static void main(String[] args){


            ProizvoditelnostPekaria Zhenya = new ProizvoditelnostPekaria();
            Zhenya.zarplata = 1000;
            Zhenya.NormaZaSmenyvmesjc = 200;
            Zhenya.YsloviePolycheniaPremii = 990;
            Zhenya.name = "Zhenya";

            ProizvoditelnostPekaria Natasha = new ProizvoditelnostPekaria();
            Natasha.zarplata = 500;
            Natasha.NormaZaSmenyvmesjc = 50;
            Natasha.YsloviePolycheniaPremii = 49;
            Natasha.name = "Natasha";

            ProizvoditelnostPekaria Ura = new ProizvoditelnostPekaria();


            Ura.RaschetZpSotrydnika();//Применяем к юре расчет зп сотрудника
            Natasha.RaschetZpSotrydnika();
            Zhenya.RaschetZpSotrydnika();

        }

    }


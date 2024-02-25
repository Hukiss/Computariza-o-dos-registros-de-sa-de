package HealthProfile;

import Gender.Gender;
import Data.Data;
import IMC.IMC;
public class Healthprofile {

        private String nome,    sobreNome;
        private int dia,    mes,     ano;
        private double weight, height;
        private String gender;

        Data data = new Data();
        IMC imc = new IMC();


        public Healthprofile(String nome, String sobreNome, String gender, double height, double weight, int dia, int mes, int ano){

            this.setNome(nome);
            this.setSobreNome(sobreNome);
            this.setGender(gender);

            if ( dia > 0 && dia <= 31)
                this.setDia(dia);

            if ( mes > 0 && mes <= 12 )
                this.setMes(mes);

            if ( ano >= 1000 && ano <= 9999 )
                this.setAno(ano);

            if ( height >= 0)
                this.setHeight(height);

            if ( weight >= 0)
                this.setWeight(weight);


            data.setDia(getDia());
            data.setMes(getMes());
            data.setAno(getAno());
            imc.setHeight(getHeight());
            imc.setWeight(getWeight());
        }

        @Override
        public String toString() {
            return "\nNome completo: " + getNome() + " " + getSobreNome() +"\nGênero: "+ genderMethods() + "\n"+ data.toString()+
                    "   Idade: " + data.calcularIdade() + "\nFrequência cardiaca máxima: " + FCMax() +
                    "\nFrequência cardiaca alvo: " + FCMaxAlvo() + "\nClassificação de peso segundo a BMI: "+ imc.BMIvalues()+"\n";
        }


        public int FCMax(){
            return 220 - data.calcularIdade();
        }

        public float FCMaxAlvo(){
            return (FCMax() * .5f);
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setSobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
        }

        public String getSobreNome() {
            return sobreNome;
        }

        public void setDia(int dia) {

            if ( dia > 0 && dia <= 31 )
                this.dia = dia;
        }

        public int getDia() {
            return dia;
        }

        public void setMes(int mes) {

            if ( mes > 0 && mes <= 12 )
                this.mes = mes;
        }

        public int getMes() {
            return mes;
        }
        public void setAno(int ano) {

            if ( ano > 999 && ano <= 9999 )
                this.ano = ano;
        }

        public int getAno() {
            return ano;
        }

        public void setWeight(double weight) {
            if (weight >= 0)
                this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public void setHeight(double height) {
            if ( height >= 0)
                this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

        public Gender genderMethods(){
            Gender genero;

            switch (getGender()){
                case "M":
                    genero = Gender.Masculino;
                    break;
                default:
                    genero = Gender.Feminino;
            }
            return genero;
        }
}

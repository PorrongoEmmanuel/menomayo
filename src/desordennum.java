import java.util.Stack;

public class desordennum {


        public void menmayo() {

            Stack<String> pila= new Stack<String>();
            int[]vec=new int[3];
            int c=0;
            int n;

            pila.push(Integer.toString(-500));
            pila.push(Integer.toString(56));
            pila.push(Integer.toString(8));

            while(!pila.empty()){
                vec[c]=Integer.parseInt(pila.pop());
                c=c+1;

            }
            int aux;
            boolean evaluar= false;

            while (!evaluar){
                evaluar=true;
                for (int i=0; i<2; i++){
                    if(vec[i]>vec[i+1]){
                        aux=vec[i];
                        vec[i]=vec[i+1];
                        vec[i+1]=aux;
                        evaluar=false;
                    }
                }
            }
            for(int i=0; i<3; i++){
                pila.push(Integer.toString(vec[i]));

            }
            System.out.println("pila de menor a mayor  es: "+ pila);
        }

        public void mayormenor(){

        }


}

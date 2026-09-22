public class Math{
    int somar (int a, int b) throws IllegalAccessException{
        if (a>b){
            throe new ErroMatematico(message: "O número 1 não deveria ser menor")
        }
        return a+b
    }
}
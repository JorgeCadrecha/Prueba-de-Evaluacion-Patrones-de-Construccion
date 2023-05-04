package Ejercicio1;

public class BaseCompuestaBuilder extends BaseBuilder{
    @Override
    public Base build(){
        return new BaseCompuesta(this.nombre);
    }
}

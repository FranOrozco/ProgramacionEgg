package entidades;

public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private Boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, Boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor:\n"
                + "Resolucion: " + pulgadas + "''"
                + "\nSintonizador TDT: " + TDT
                + "\nColor: " + color
                + "\nConsumo Electrico: " + consumoEnergetico
                + "\nPeso: " + peso + " Kg"
                + "\nPrecio final: $" + precio;
    }

    @Override
    public Electrodomestico crearElectrodomestico() {
        Televisor televisor = new Televisor();
        System.out.println("Ingrese las pulgadas.");
        televisor.setPulgadas(leer.nextInt());
        System.out.println("¿Tiene sintonizador TDT? s/n");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("s")) {
            televisor.setTDT(true);
        } else {
            televisor.setTDT(false);
        }
        System.out.println("Ingrese el color: ");
        televisor.setColor(comprobarColor(leer.next()));
        System.out.println("Ingrese el consumo energético: ");
        char op = leer.next().charAt(0);
        televisor.comprobarConsumoEnergetico(op);
        System.out.println("Ingrese el peso: ");
        televisor.setPeso(leer.nextDouble());
        televisor.precioFinal();
        return televisor;
    }

    @Override
    public void precioFinal() {
        if (peso < 20) {
            setPrecio(precio + 100);
        } else if (peso < 50) {
            setPrecio(precio + 500);
        } else if (peso < 80) {
            setPrecio(precio + 800);
        } else if (peso > 80) {
            setPrecio(precio + 1000);
        }
        switch (getConsumoEnergetico()) {
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
            default:
                break;
        }
        if (getPulgadas() > 40) {
            setPrecio(getPrecio() * 1.3d);
        }
        if (TDT) {
            setPrecio(getPrecio() + 500);
        }
    }

}

package main;

import java.util.Scanner;

public class Apliccation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carr movil=new carr();
		Scanner j=new Scanner(System.in);
		
		System.out.println("Bienvenido a la empresa TecnoMotors");
		System.out.println("Elige una de las siguientes funciones");
		System.out.printf("1:Registrar %n2:examinar %n3:salir");
		
		int option=j.nextInt();
		while(option==1) {
			System.out.println("Comenzamos registrando la marca de AutoMovil");
			System.out.printf("1:Toyota \n2:Hyundai \n3:Mazda \n4:Nissan \n5:Kia");
			int menu=j.nextInt();
			while(menu==1) {
				System.out.println("Registra el agno");
				movil.setYears(j.nextShort());
				System.out.println("Introduce chasis");
				movil.setChasis(j.nextInt());
				System.out.println("introduce numero de placa");
				movil.setPlaca(j.nextShort());
				System.out.println("El vehiculo que acabas de registrar es un " + movil.getModelo() +
						" del agno " + movil.getYears() + " con un chasis de la serie " + movil.getChasis() + 
						" y con una placa con los digitos " + movil.getPlaca());
				
				menu=0;
				
			}while(menu==2) {
				System.out.println("Registra el agno");
				movil.setYears(j.nextShort());
				System.out.println("Introduce chasis");
				movil.setChasis(j.nextInt());
				System.out.println("introduce numero de placa");
				movil.setPlaca(j.nextShort());
				System.out.println("El vehiculo que acabas de registrar es un " + movil.getModelo2() +
						" del agno " + movil.getYears() + " con un chasis de la serie " + movil.getChasis() + 
						" y con una placa con los digitos " + movil.getPlaca());
				
				menu=0;
				
			}while(menu==3) {
				System.out.println("Registra el agno");
				movil.setYears(j.nextShort());
				System.out.println("Introduce chasis");
				movil.setChasis(j.nextInt());
				System.out.println("introduce numero de placa");
				movil.setPlaca(j.nextShort());
				System.out.println("El vehiculo que acabas de registrar es un " + movil.getModelo3() +
						" del agno " + movil.getYears() + " con un chasis de la serie " + movil.getChasis() + 
						" y con una placa con los digitos " + movil.getPlaca());
				
				menu=0;
				
			}while(menu==4) {
				System.out.println("Registra el agno");
				movil.setYears(j.nextShort());
				System.out.println("Introduce chasis");
				movil.setChasis(j.nextInt());
				System.out.println("introduce numero de placa");
				movil.setPlaca(j.nextShort());
				System.out.println("El vehiculo que acabas de registrar es un " + movil.getModelo4() +
						" del agno " + movil.getYears() + " con un chasis de la serie " + movil.getChasis() + 
						" y con una placa con los digitos " + movil.getPlaca());
				
				menu=0;
				
			}while(menu==5) {
				System.out.println("Registra el agno");
				movil.setYears(j.nextShort());
				System.out.println("Introduce chasis");
				movil.setChasis(j.nextInt());
				System.out.println("introduce numero de placa");
				movil.setPlaca(j.nextShort());
				System.out.println("El vehiculo que acabas de registrar es un " + movil.getModelo5() +
					" del agno " + movil.getYears() + " con un chasis de la serie " + movil.getChasis() + 
					" y con una placa con los digitos " + movil.getPlaca());
			
			menu=0;
				
			}
			
		}while(option==2) {
			
			System.out.println("Lamentablemente no hay Systema intente en otro momento :3");
			break;
		}while(option==3) {
			
		}
	}

}

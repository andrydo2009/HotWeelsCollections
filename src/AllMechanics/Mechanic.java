package AllMechanics;

import java.util.Objects;

public class Mechanic {


    final private String firstNameMechanic;
    final private String secondNameMechanic;
    private String marketCompany;
    final private VehicleRepairSpecification vehicleRepairSpecification;

    public Mechanic(String firstNameMechanic , String secondNameMechanic , String marketCompany , VehicleRepairSpecification vehicleRepairSpecification) {
        this.firstNameMechanic = firstNameMechanic;
        this.secondNameMechanic = secondNameMechanic;
        setMarketCompany ( marketCompany );
        this.vehicleRepairSpecification = vehicleRepairSpecification;
    }


    public String getFirstNameMechanic() {
        return firstNameMechanic;
    }

    public String getSecondNameMechanic() {
        return secondNameMechanic;
    }

    public String getMarketCompany() {
        return marketCompany;
    }

    public VehicleRepairSpecification getVehicleRepairSpecification() {
        return vehicleRepairSpecification;
    }

    public void setMarketCompany(String marketCompany) {
        if (marketCompany == null || marketCompany.isBlank () || marketCompany.isEmpty ()) {
            this.marketCompany = " механик автодрома ";
        } else {
            this.marketCompany = marketCompany;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals ( firstNameMechanic , mechanic.firstNameMechanic ) && Objects.equals ( secondNameMechanic , mechanic.secondNameMechanic ) && Objects.equals ( marketCompany , mechanic.marketCompany ) && vehicleRepairSpecification == mechanic.vehicleRepairSpecification;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( firstNameMechanic , secondNameMechanic , marketCompany , vehicleRepairSpecification );
    }

    @Override
    public String toString() {
        return getSecondNameMechanic () + " " + getFirstNameMechanic () + " "
                + " из компании " + getMarketCompany () + " с классификацией " + getVehicleRepairSpecification ();
    }

}
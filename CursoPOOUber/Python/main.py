from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("AMS234", Account("Andres Herrera", "35.468.894"))
    print(vars(car))
    print(vars(car.driver))
    
    car2 = Car("QWE567", Account("Marta Herrera", "12.423.453"))
    print(vars(car2))
    print(vars(car2.driver))

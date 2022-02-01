from car import Car
from account import Account
from uberX import UberX
from user import User
from driver import Driver

if __name__ == "__main__":
    car = Car()
    car.license = "GHJ789"
    car.driver = "Andres Andrada"
    car.id = "564984"
    car.passenger = "3"
    print(vars(car.id))
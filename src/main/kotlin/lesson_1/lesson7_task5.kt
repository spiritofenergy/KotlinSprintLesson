package org.example.lesson_1

import java.math.RoundingMode

fun main (){
    lesson7task5()
}
/*
Задача 7* к Уроку 5
Калькулятор топлива
Программа должна рассчитывать стоимость топлива для поездки в зависимости от расхода автомобиля и текущей цены на бензин.
Запроси следующие данные через консоль. Все данные должны записываться в переменные типа Float или Double:
- Расстояние поездки (в километрах);
- Расход топлива на 100 км (в литрах);
- Текущую цену за литр топлива.
Сначала рассчитай общее количество литров топлива, которое потребуется для поездки по следующей формуле:
 Топливо = (расстояние * расход на 100 км) / 100.
Затем рассчитай общую стоимость топлива по формуле: Стоимость = топливо × цена за литр.
Выведи в консоль общее количество необходимого топлива и итоговую стоимость поездки, округлив её до двух знаков после запятой.
 */
const val FUEL_CONSUMTION = 7
fun lesson7task5(){

    println("Какое расстояние?")
    val travelDistance = readln().toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
    println("Введите цену горючего?")
    val priceOfFuel = readln().toBigDecimal().setScale(2, RoundingMode.UP).toDouble()

    // Объём топлива
    val fuelVolume = travelDistance.toInt() / 10 * priceOfFuel.toInt()
    // Стоимость поездки
    val costOfTrip = fuelVolume * priceOfFuel

    println("Расстояние:         " + travelDistance + " километров")
    println("Расход топлива:    " + FUEL_CONSUMTION.toFloat() + " литров")
    println("Цена бензина:       " + priceOfFuel + " рублей")
    println("Количества бензина: " + fuelVolume + " литров")
    println("Стоимость поездки:  " + costOfTrip + " рублей")


}
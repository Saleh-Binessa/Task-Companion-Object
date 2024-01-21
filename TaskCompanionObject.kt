class TemperatureConverter {
    companion object {
        fun celsiusToFahrenheit(celsius: Double): Double {
            return celsius * 9 / 5 + 32
        }

        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }

        fun celsiusToKelvin(celsius: Double): Double {
            return celsius + 273
        }

        fun kelvinToCelsius(kelvin: Double): Double {
            return kelvin - 273
        }

//        fun fahrenheitToKelvin(fahrenheit: Double): Double {
//            return celsiusToKelvin(fahrenheitToCelsius(fahrenheit))
//        }
//
//        fun kelvinToFahrenheit(kelvin: Double): Double {
//            return celsiusToFahrenheit(kelvinToCelsius(kelvin))
//        }
    }
}
fun main() {
    // Example usage
    val celsiusTemperature = 25.0

    // Convert Celsius to Fahrenheit
    val fahrenheitTemperature = TemperatureConverter.celsiusToFahrenheit(celsiusTemperature)
    println("$celsiusTemperature°C is $fahrenheitTemperature°F")
    // Convert Fahrenheit to Celsius
    val convertedCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheitTemperature)
    println("$fahrenheitTemperature°F is $convertedCelsius°C")
    // Convert Kelvin to Celsius
    val kelvinTemperature = TemperatureConverter.celsiusToKelvin(celsiusTemperature)
    println("$celsiusTemperature°C is $kelvinTemperature K")
}
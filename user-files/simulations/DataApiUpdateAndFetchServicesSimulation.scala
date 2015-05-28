import io.gatling.core.Predef._
import scenarios.DataApiScenarios.{updateServices, fetchServices}
import utils.DigitalMarketplaceHttpConf
import utils.SimulationProperties._

class DataApiUpdateAndFetchServicesSimulation extends Simulation with DigitalMarketplaceHttpConf {
  setUp(
    updateServices.inject(atOnceUsers(numberOfUsers)).protocols(dataApiHttpConf),
    fetchServices.inject(atOnceUsers(numberOfUsers)).protocols(dataApiHttpConf)
  )
}

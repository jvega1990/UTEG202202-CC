library(sf)
library(leaflet)
library(ggplot2)
library(dplyr)
choose.files()

## Carga de datos
cantones = st_read("C:\\Curso Leaflete Rstudio\\Proyecto\\datos_espaciales\\cantones.geojson")
escuelas = st_read("C:\\Curso Leaflete Rstudio\\Proyecto\\datos_espaciales\\escuelas.geojson")
parroquias = st_read("C:\\Curso Leaflete Rstudio\\Proyecto\\datos_espaciales\\parroquias.shp")
vias_p = st_read("C:\\Curso Leaflete Rstudio\\Proyecto\\datos_espaciales\\vias_p.kml")

## Ver el tamaño de los objetos
object.size(parroquias)
object.size(cantones)

## Simplificar la geometría
parroquias = st_simplify(parroquias,preserveTopology = TRUE, dTolerance = 20)

## Transformar el sistema de coordenadas a geofráficas
cantones = st_transform(cantones, 4326)
escuelas = st_transform(escuelas, 4326)
parroquias = st_transform(parroquias, 4326)
vias_p = st_transform(vias_p, 4326)

## Opciones para obtener el límite en caja de un objeto geográfico
coor = st_coordinates(cantones$geometry)
lng = mean(coor[,1])
lat = mean(coor[,2])

caja = st_bbox(cantones) %>% as.vector()

## Colores para variables del objeto
pal = colorNumeric("OrRd", domain = cantones$area_km)
pal2 = colorNumeric("BuPu",domain = c(0,48), na.color = NA)

## Trabajando en el mapa leaflet
leaflet() %>%
  addPolygons(data= cantones) %>% addCircles(data = escuelas) %>% 
  addPolylines(data = vias_p)
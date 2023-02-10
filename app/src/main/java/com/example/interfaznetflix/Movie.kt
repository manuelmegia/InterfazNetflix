package com.example.interfaznetflix

data class Movie (
        val id: Int,
        val title: String,
        val description: String,
        val featuredImage: Int
    ) {
    companion object {
        val data
            get() = listOf(
                Movie(
                    1,
                    "10 Tips Para Estudiar",
                    "Descubre cómo aumentar tu productividad al estudiar",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    2,
                    "Guía para escribir tu primer cuento",
                    "Incursiona en el mundo de la narración infantil",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    3,
                    "Optimizar trabajos grupales",
                    "Aplica estas estrategias para mejorar tus trabajos en grupo",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    4,
                    "Libros que nunca habías escuchado",
                    "Te presentamos la lista de los libros más raros",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    5,
                    "Cómo mejorar en la universidad",
                    "En este artículo una actitud adecuada para la U",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    6,
                    "40 buscadores de artículos científicos",
                    "Descubre los buscadores más importantes para cada área del conocimiento",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    7,
                    "Pautas para escribir un ensayo",
                    "Karla te explica un marco de trabajo para hace ensayos",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    8,
                    "Crear un ambiente de estudio para llegar a \"la zona\"",
                    "Aprende a modificar tu entorno para sacar el máximo beneficio de tu mente",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    9,
                    "Estudiar 80 horas semanales",
                    "Como Carlos logró estudiar 80 horas sin agotarse",
                    R.drawable.ic_launcher_foreground
                ),
                Movie(
                    10,
                    "Lo que tu tutor de tesis no te dice",
                    "Consejos para terminar trabajos de grado rápido",
                    R.drawable.ic_launcher_foreground
                )
            )
    }
}
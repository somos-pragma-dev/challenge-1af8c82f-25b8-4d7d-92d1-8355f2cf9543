# Simulación de Ciclo de Vida de Estado en Pipeline

En un entorno de banca digital, es crucial monitorear el estado de las transacciones a través de un pipeline de procesamiento. El objetivo es simular el ciclo de vida de un estado de transacción desde su creación hasta su finalización, manejando eventos y transiciones de estado de manera idónea. Los actores involucrados son el sistema de origen de transacciones, el pipeline de procesamiento y el sistema de auditoría. Las transacciones tienen un identificador único y un estado que puede ser 'pendiente', 'procesando', 'completado' o 'fallido'. El pipeline debe manejar un volumen de 100 transacciones por segundo y garantizar que cada transacción sea procesada exactamente una vez, a pesar de posibles reintentos o fallos temporales.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Status Progression Test |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Estados y Transiciones

**Objetivo:** Establecer los estados válidos y las transiciones permitidas para una transacción en el pipeline.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identificar los estados válidos de una transacción.
- Definir las transiciones permitidas entre estos estados.
- Establecer criterios de aceptación para validar las transiciones.

**Entregable:** Documento que describe los estados y transiciones de una transacción.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo se manejan los estados en sistemas de flujo de trabajo.
- Piensa en las condiciones que deben cumplirse para permitir una transición.

</details>

### Fase 2: Simulación de Transiciones

**Objetivo:** Simular el proceso de una transacción a través del pipeline, manejando transiciones de estado y eventos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crear una simulación que muestre una transacción pasando por los estados definidos.
- Incorporar eventos que causen transiciones de estado.
- Implementar manejo de errores y reintentos para asegurar la consistencia del estado.

**Entregable:** Simulación que muestra una transacción pasando por todos los estados definidos, con manejo de eventos y errores.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo simular eventos asíncronos que causen transiciones.
- Piensa en estrategias para manejar reintentos y asegurar la idempotencia.

</details>

### Fase 3: Evaluación y Mejora

**Objetivo:** Evaluar la simulación creada y proponer mejoras para manejar casos extremos y optimizar el rendimiento.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analizar la simulación para identificar posibles mejoras.
- Proponer soluciones para manejar casos extremos, como altas tasas de transacciones o fallos del sistema.
- Sugerir optimizaciones para mejorar el rendimiento y la escalabilidad.

**Entregable:** Documento que evalúa la simulación y propone mejoras para casos extremos y optimización.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo el sistema se comporta bajo carga y cómo podría mejorarse.
- Piensa en estrategias para optimizar el rendimiento sin comprometer la fiabilidad.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los estados y transiciones en el contexto de una transacción en un pipeline de procesamiento?
- **paraQueSirve**: ¿Para qué sirve definir y manejar transiciones de estado en una transacción?
- **comoSeUsa**: ¿Cómo se usa la simulación para probar el manejo de transiciones y eventos en una transacción?
- **erroresComunes**: ¿Cuáles son los errores comunes al simular transiciones de estado y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de una simulación para manejar transiciones de estado y eventos?

## Criterios de Evaluacion

- Definir correctamente los estados y transiciones de una transacción.
- Simular adecuadamente el proceso de una transacción a través del pipeline.
- Manejar eventos y errores de manera efectiva para asegurar la consistencia del estado.
- Evaluar la simulación y proponer mejoras para casos extremos y optimización.

---

*Reto generado automaticamente por Challenge Generator - Pragma*

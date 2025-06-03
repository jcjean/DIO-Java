# Sobre o RestController

Um `RestController` em Spring é, basicamente, uma classe contendo anotações específicas para a disponibilização de recursos HTTP baseados em nossos serviços e regras de negócio.

## Anotações e configurações mais comuns:

- `@RestController`: Responsável por designar o bean do componente que suporta requisições HTTP com base na arquitetura REST.

- `@RequestMapping(prefix)`: Determina qual a URI comum para todos os recursos disponibilizados pelo controller.

- `@GetMapping`: Indica que o método aceitará requisições HTTP do tipo **GET**.

- `@PostMapping`: Indica que o método aceitará requisições HTTP do tipo **POST**.

- `@PutMapping`: Indica que o método aceitará requisições HTTP do tipo **PUT**.

- `@DeleteMapping`: Indica que o método aceitará requisições HTTP do tipo **DELETE**.

- `@RequestBody`: Converte um JSON para o tipo do objeto esperado como parâmetro no método.

- `@PathVariable`: Determina que parte da URI será composta por parâmetros recebidos nas requisições.

### Exemplos de uso:
[Utilizando o @GetMapping](https://github.com/jcjean/DIO-Java/blob/main/my-first-web-api/src/main/java/dio/web_api/controller/UsuarioController.java)

# Gestão de Gastos
Controle seu dinheiro sem complicação. Registre receitas e despesas, visualize seu saldo e tome decisões melhores no dia a dia.

Manter as contas em dia não precisa ser chato. A ideia aqui é ter um app simples, rápido de usar e fácil de evoluir, sem depender de planilhas complexas.

# Recursos
- Cadastro, edição e exclusão de lançamentos (receitas e despesas)
- Categorias e descrição livre para cada lançamento
- Filtros por período, tipo e categoria
- Resumo com totais e saldo do período
- Banco H2 em desenvolvimento (simples e sem instalação)

# Tecnologias
- Java 21
- Spring Boot (Web, Validation)
- Spring Data JPA
- H2 (dev) e Postgres/MySQL (prod)
- Thymeleaf + HTML/CSS (UI)
- Maven

# Começando 
1) Pré-requisitos
   - JDK 21 instalado (JAVA_HOME configurado)
   - Opcional: Docker, se quiser rodar em container

2) Rodar em desenvolvimento (perfil padrão com H2)
   ```cmd
   mvnw.cmd spring-boot:run
3) Rodar com perfil específico 
    mvnw.cmd spring-boot:run -Dspring-boot.run.profiles=dev

src/
├─ main/
│  ├─ java/... (controllers, services, repositories, models)
│  └─ resources/
│     ├─ templates/ (HTML Thymeleaf)
│     ├─ static/ (CSS, JS)
│     └─ application.properties
└─ test/ (JUnit)

####UFPE - Universidade Federal de Pernambuco
####CIn - Centro de Informática

##Projeto Infra-Distibuição 2010-2
####Tarcisio Coutinho da Silva - tcs5@cin.ufpe.br

###Objetivo:
Facilitar o desenvolvimento de sistemas de Computação Voluntária através da implementação de um middleware

###Padrões de Projeto Adotados:

1. Transparência de acesso
   * Client Proxy
2. Acesso a objetos remotos
   * Requestor
3. Invocação de objeto remoto
   * Invoker
4. Serialização
   * Marshaller  
5. Gestor de conexões 
   1. Client Side
      * Client Request Handler
   2. Server Side
      * Server Request Handler	
6. Gerenciamento de Ciclo de Vida
   * Per-Request Instance
	
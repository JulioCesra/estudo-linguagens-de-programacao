public static void main(String[] args){
    // Array
    // Possui tamanho definido
    String[] array_string = new String[5]; // Array sem valores
    String[] nomes = {"Júlio","Carlos","Luca","Rogério"}; // Array com valores definidos
    for(int i = 0; i < nomes.length; i ++){
        String item_atual = nomes[i];
        String output = String.format("""
                Posição do item: %d | Nome: %s
                """, i, item_atual);
        System.out.println(output);
    }
    // ArrayList
    // Tamanho dinâmico
    ArrayList<Integer> idades = new ArrayList<>();
    idades.add(18);
    idades.add(20);
    idades.add(60);
    for(int i = 0; i < idades.toArray().length; i ++){
        int item_atual = idades.get(i);
        String output = String.format("""
                Posição do item: %d | Idade: %d
                """, i, item_atual);
        System.out.println(output);
    }
}

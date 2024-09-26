// Seleciona todas as âncoras de expandir
const expand_img_links = document.querySelectorAll(".expand_img_btn");
const accordions = document.querySelectorAll(".accordion");

// Função de acordéon
accordions.forEach((accordion) => {
    accordion.addEventListener("click", () => {
        const body = accordion.querySelector(".accordion-body");
        body.classList.toggle("active-a");
    });
});

// Função de expandir imagem
expand_img_links.forEach((expand_img_link) => {
    // Adiciona evento de clique à âncora de expandir
    expand_img_link.addEventListener("click", (event) => {
        event.preventDefault(); // Evita que a âncora navegue para outro lugar

        // Relaciona o link ao modal correto usando um seletor
        const expand_img = document.getElementById(expand_img_link.dataset.target);
        expand_img.showModal(); // Abre o modal correspondente

        // Seleciona o botão de fechar específico dentro do modal
        const close_img = expand_img.querySelector(".close_img");

        // Evento de fechar modal
        close_img.addEventListener("click", () => {
            expand_img.close(); // Fecha o modal correspondente
        });
    });
});

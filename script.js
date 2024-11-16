// Seleciona todas as âncoras de expandir
let isExpanding = false;
let slideInterval; // Variável para armazenar o intervalo de slides
const expandImgLinks = document.querySelectorAll(".expand_img_btn");
const accordions = document.querySelectorAll(".accordion");

document.addEventListener('DOMContentLoaded', () => {
    // Verifica se está rodando localmente ou em GitHub Pages
    const isLocal = window.location.hostname === '127.0.0.1' || window.location.hostname === '';

    // Ajusta os links que apontam para "/"
    const anchors = document.querySelectorAll('a[href="/"]');
    anchors.forEach(anchor => {
      if (isLocal) {
        // Se local, mantém "/" ou redireciona para o diretório local raiz
        anchor.href = '/';
      } else {
        // Se no GitHub Pages, redireciona para "/example"
        anchor.href = '/Os_Sete_Wiki';
      }
    });
});

function showMobileLinks() {
    const links = document.getElementById("links");
    if(links.style.display === "block") {
        links.style.display = "none";
    }
    else {
        links.style.display = "block";
    }
}

// Função de acordéon
accordions.forEach((accordion) => {
    accordion.addEventListener("click", () => {
        const body = accordion.querySelector(".accordion-body");
        body.classList.toggle("active-a");
    });
});

// Função de expandir imagem
expandImgLinks.forEach((expandImgLink) => {
    // Adiciona evento de clique à âncora de expandir
    expandImgLink.addEventListener("click", (event) => {
        isExpanding = true; // Indica que a imagem está sendo expandida
        event.preventDefault(); // Evita que a âncora navegue para outro lugar

        // Relaciona o link ao modal correto usando um seletor
        const expandImg = document.getElementById(expandImgLink.dataset.target);
        expandImg.showModal(); // Abre o modal correspondente

        // Seleciona o botão de fechar específico dentro do modal
        const closeImg = expandImg.querySelector(".close_img");

        // Evento de fechar modal
        closeImg.addEventListener("click", () => {
            expandImg.close(); // Fecha o modal correspondente
            isExpanding = false; // Indica que a imagem não está mais expandida
            startSlideShow(); // Reinicia o slideshow quando o modal é fechado
        });
    });
});

// Inicia o slideshow e configura a rolagem automática
function startSlideShow() {
    slideIndex = 0; // Reinicia o índice do slide
    showSlides(); // Mostra o primeiro slide
    slideInterval = setInterval(showSlides, 3000); // Troca de slide a cada 3 segundos
}

function showSlides() {
    let i;
    let slides = document.getElementsByClassName("mySlides");
    let dots = document.getElementsByClassName("dot");

    // Esconder todos os slides
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";  
    }

    slideIndex++;
  
    // Reiniciar slideshow se ultrapassar o número de slides
    if (slideIndex > slides.length) {
        slideIndex = 1;
    }

    // Remover a classe "active" de todos os pontos
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", " ");
    }

    // Exibir o slide atual e adicionar a classe "active" ao ponto correspondente
    slides[slideIndex - 1].style.display = "block";  
    dots[slideIndex - 1].className += " active";
}

// Para parar o slideshow quando a imagem é expandida
expandImgLinks.forEach((expandImgLink) => {
    expandImgLink.addEventListener("click", () => {
        clearInterval(slideInterval); // Para o slideshow
    });
});

// Inicia o slideshow
startSlideShow();
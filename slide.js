let slideIndex = 0;
showSlides();

// Função para controle manual (próximo slide)
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Função para controle manual (slide específico)
function currentSlide(n) {
  showSlides(slideIndex = n - 1); // Ajustando índice para corresponder
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
    dots[i].className = dots[i].className.replace(" active", "");
  }

  // Exibir o slide atual e adicionar a classe "active" ao ponto correspondente
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}

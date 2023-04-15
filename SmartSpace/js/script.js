const swiper = new Swiper('.slider-main-block', {
    // Optional parameters
    loop: true,
  
    // Navigation arrows
    navigation: {
      nextEl: '.body-main-block__arrow.swiper-button-next',
      prevEl: '.body-main-block__arrow.swiper-button-prev',
    },
  });

  // Tabs
  const tabNavItems = document.querySelectorAll('.tabs-deals__button');
  const tabItems = document.querySelectorAll('.item-tabs');
  
  document.addEventListener("click", function(e) {
    const targetElement = e.target;
  
    if (targetElement.closest('.tabs-deals__button')) {
      let currentActiveIndex = null;
      let newActiveIndex = null;
  
      tabNavItems.forEach((tabNavItem, index) => {
        if (tabNavItem.classList.contains('active')) {
          currentActiveIndex = index;
        }
        if (tabNavItem === targetElement) {
          newActiveIndex = index;
        }
      });
  
      if (newActiveIndex !== null && newActiveIndex !== currentActiveIndex) {
        tabNavItems[currentActiveIndex].classList.remove('active');
        tabItems[currentActiveIndex].classList.remove('active');
        tabNavItems[newActiveIndex].classList.add('active');
        tabItems[newActiveIndex].classList.add('active');
      }
    }
  });
  
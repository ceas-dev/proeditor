fetch('/user')
  .then(response => response.json())
  .then(users => {
    console.log(users)
    montar(users)
  })
  .catch(error => {
    console.error('Erro ao carregar usuários:', error);
  });

  function montar(users){
    const userList = document.getElementById('list');
    users.forEach(user => {
      const listItem = document.createElement('li');
      listItem.classList.add('list-group-item', 'd-flex', 'justify-content-between', 'align-items-center');
      listItem.innerHTML = `
            ${user.username}
            <span class="badge bg-secondary">Data: ${user.date}</span>
          `;
      userList.appendChild(listItem);
    });
  }


  var nome = 1;
  
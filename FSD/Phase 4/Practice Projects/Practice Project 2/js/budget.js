let Budget = class 
{
  constructor(budget, expenseName, expense) 
  {
    this.budget = budget;
    this.expenseName = expenseName;
    this.expense = expense;
  }
  submitExpense() 
  {
    const value = this.budgetInput.value;
    if (value === '' || value < 0) 
    {
      this.budgetFeedback.classList.add('showItem');
      this.budgetFeedback.innerHTML = `<p>value cannot be empty or negative</p>`;
      const self = this;
      setTimeout(function () 
      {
        self.budgetFeedback.classList.remove('showItem');
      }, 3000);
    } 
    else
     {
      this.budget.textContent = value;
      this.budgetInput.value = '';
      this.showBalance();
    }
  }
  addExpense(expName, expAmt) 
  {
    if (expName == "" || expAmt == "")
     {
      alert("Please enter something first!");
     } 
    else
     {
      var html = "";
      var btnRemove = document.createElement("INPUT");
      btnRemove.type = "button";
      btnRemove.value = "Remove";
      btnRemove.setAttribute("onclick", "Remove(this);");
      html = "<tr><td>" + expName + "</td><td>" + expAmt  + "</td></tr>";
      document.getElementById('result').innerHTML += html;
    }
  }
  showBalance() 
  {
    console.log(`
        The bud details is as follows :
        id : ${this.budget}
        name : ${this.expensee}
         `);
  }
  // get & set methods
  setbudget(budget) 
  {
    this.budget = budget;
  }
  getbudget() 
  {
    return this.budget;
  }
  setexpenseName(expenseName) 
  {
    this.expenseName = expenseName;
  }
  getexpenseName() 
  {
    return this.expenseName;
  }
  setexpense(expense) 
  {
    this.expense = expense;
  }
  getexpense()
   {
    return this.expense;
    }
};
$(document).ready(function ()
 {
  $('#Submit').click(function () 
  {
    let budgetObj = new Budget();
    const value = document.form1.budget.value;
    budgetObj.setbudget(value);
    console.log(budgetObj.getbudget());
    budgetObj.showBalance();
    document.getElementById('budget-amount').innerHTML = budgetObj.getbudget();
  });
})
$(document).ready(function () 
{
  $('#ExpSubmit').click(function () 
  {
    let budgetObj = new Budget();
    let expName = document.form2.expenseName.value;
    let expAmt = document.form2.expenseAmt.value;
    budgetObj.setexpenseName(expName);
    budgetObj.setexpense(expAmt);
    console.log(budgetObj.getexpenseName());
    let expense_get = 0;
    let expense_final = 0;
    expense_get = document.getElementById('expense-amount').innerHTML;
    console.log(expense_get);
    expense_final =  +expense_get + +expAmt;
    console.log(expense_get);
    document.getElementById('expense-amount').innerHTML = expense_final;
    let balance_get = 0;
    let budget_get = 0;
    let balance_final = 0;
    budget_get = document.getElementById('budget-amount').innerHTML;
    balance_get = document.getElementById('balance-amount').innerHTML;
    console.log(budget_get);
    console.log(balance_get);
    balance_final = budget_get - expense_final;
    console.log(balance_final);
    document.getElementById('balance-amount').innerHTML = balance_final;
    budgetObj.addExpense(expName, expAmt)
  });
})
$(document).ready(function ()
 {
  Rs('#SubmitDetails').click(function () 
  {
     alert("This is submitted");
  });
})
def calculate_investment():
    yield_rate = 5.92 # 12.5% annual return
    current_investment = 2000 # initial investment
    weeks = 2080 # 0.5 year
    subscription = 500 # weekly subscription
    for week in range(1, weeks):
        week_yield = current_investment * (yield_rate / 100) / 52
        current_investment = current_investment + subscription + week_yield
        if week % 2 == 0:
            print(f'Week {week}, with yield of: ${week_yield:.2f} will save ${current_investment:.2f}')

calculate_investment()
#$21_189_834.82
#$12_713_900.89
#$4_253_923.09
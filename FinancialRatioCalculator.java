import java.util.Scanner;

import javax.xml.transform.Source;

public class FinancialRatioCalculator{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read financial statement data for the last 10 year
        System.out.println("Enter the no of years you want calculate the ratios for: ");
        int numYears = scanner.nextInt();
        System.out.println("Enter the recent year the ratios has been recorded: ");
        int year = scanner.nextInt();
        System.out.println("The ratios of the year: " + year);
        double[] currentAssets = new double[numYears];
        double[] currentLiabilities = new double[numYears];
        double[] inventory = new double[numYears];
        double[] accountsReceivable = new double[numYears];
        double[] revenue = new double[numYears];
        double[] costOfGoodsSold = new double[numYears];
        double[] operatingExpenses = new double[numYears];
        double[] netIncome = new double[numYears];
        double[] accountsPayable = new double[numYears];
        double[] net_profit = new double[numYears];
        double[] profit_after_Tax = new double[numYears];
        double[] preference_dividend = new double[numYears];
        double[] equity_share_capital = new double[numYears];
        double[] share_capital = new double[numYears];
        double[] faceValue = new double[numYears];
        double[] parValueOfShare = new double[numYears];
        double[] dividendOfProfitShare = new double[numYears];
        double[] noOfEquityShares = new double[numYears];
        double[] LongTermDebt = new double[numYears];
        double[] EquityShareHolderFunds = new double[numYears];
        double[] TotalDebt = new double[numYears];
        double[] TotalTangibleAssets = new double[numYears];
        double[] ShareholdersNetwork = new double[numYears];
        double[] netFixedAsset = new double[numYears];
        double[] netCapitalEmployed = new double[numYears];
        double[] shareholdersFunds = new double[numYears];
        double[] LongTermLiabilities = new double[numYears];
        double[] EarningsBeforeintrestAndTax = new double[numYears];
        double[] intrest = new double[numYears];
        double[] EarningsAfterTax = new double[numYears];
        double[] marketPrice = new double[numYears];
        double[] earningsPerShare = new double[numYears];
        double[] dividend = new double[numYears];
        double[] DividendPerShare = new double[numYears];

        for (int i = 0; i < numYears; i++) {
            System.out.println("Year " + (i + 1));
            System.out.println("Enter current assets:");
            currentAssets[i] = scanner.nextDouble();

            System.out.println("Enter current liabilities:");
            currentLiabilities[i] = scanner.nextDouble();

            System.out.println("Enter inventory:");
            inventory[i] = scanner.nextDouble();

            System.out.println("Enter accounts receivable:");
            accountsReceivable[i] = scanner.nextDouble();

            System.out.println("Enter revenue:");
            revenue[i] = scanner.nextDouble();

            System.out.println("Enter cost of goods sold:");
            costOfGoodsSold[i] = scanner.nextDouble();

            System.out.println("Enter operating expenses:");
            operatingExpenses[i] = scanner.nextDouble();

            System.out.println("Enter net income:");
            netIncome[i] = scanner.nextDouble();

            System.out.println("Enter net accounts payable:");
            accountsPayable[i] = scanner.nextDouble();

            System.out.println("Enter net profit:");
            net_profit[i] = scanner.nextDouble();

            System.out.println("Enter profit after tax:");
            profit_after_Tax[i] = scanner.nextDouble();

            System.out.println("Enter preference dividend:");
            preference_dividend[i] = scanner.nextDouble();

            System.out.println("Enter equity share cpital:");
            equity_share_capital[i] = scanner.nextDouble();

            System.out.println("Enter share cpital:");
            share_capital[i] = scanner.nextDouble();

            System.out.println("Enter face Value:");
            faceValue[i] = scanner.nextDouble();

            System.out.println("Enter par Value of share:");
            parValueOfShare[i] = scanner.nextDouble();

            System.out.println("Enter dividend of profit shares:");
            dividendOfProfitShare[i] = scanner.nextDouble();

            System.out.println("Enter no of equity shares:");
            noOfEquityShares[i] = scanner.nextDouble();

            System.out.println("Enter long term debt:");
            LongTermDebt[i] = scanner.nextDouble();

            System.out.println("Enter equity shareholder funds:");
            EquityShareHolderFunds[i] = scanner.nextDouble();

            System.out.println("Enter Total debt:");
            TotalDebt[i] = scanner.nextDouble();

            System.out.println("Enter Total Tangible Assets:");
            TotalTangibleAssets[i] = scanner.nextDouble();

            System.out.println("Enter Shareholders Network:");
            ShareholdersNetwork[i] = scanner.nextDouble();

            System.out.println("Enter net fixed asset:");
            netFixedAsset[i] = scanner.nextDouble();

            System.out.println("Enter net capital employes:");
            netCapitalEmployed[i] = scanner.nextDouble();

            System.out.println("Enter Shareholders Funds:");
            shareholdersFunds[i] = scanner.nextDouble();

            System.out.println("Enter Long Term Liabilities:");
            LongTermLiabilities[i] = scanner.nextDouble();

            System.out.println("Enter Earnings before Intrest:");
            EarningsBeforeintrestAndTax[i] = scanner.nextDouble();

            System.out.println("Enter intrest:");
            intrest[i] = scanner.nextDouble();

            System.out.println("Enter Earnings after Tax:");
            EarningsAfterTax[i] = scanner.nextDouble();

            System.out.println("Enter market price:");
            marketPrice[i] = scanner.nextDouble();

            System.out.println("Enter Earnings per share:");
            earningsPerShare[i] = scanner.nextDouble();

            System.out.println("Enter dividend:");
            dividend[i] = scanner.nextDouble();

            System.out.println("Enter Dividend per share:");
            DividendPerShare[i] = scanner.nextDouble();

        }

        // Calculate liquidity ratios and output results
        System.out.println("Liquidity ratios:");
        for (int i = 0; i < numYears; i++) {
            double currentRatio = currentAssets[i] / currentLiabilities[i];
            double quickRatio = (currentAssets[i] - inventory[i] - accountsReceivable[i]) / currentLiabilities[i];
            double absoluteLiquidityRatio = (currentAssets[i] - inventory[i]) / currentLiabilities[i];
            double debtorsTurnoverRatio = revenue[i] / accountsReceivable[i];
            double inventoryTurnoverRatio = costOfGoodsSold[i] / inventory[i];
            double payablesTurnoverRatio = costOfGoodsSold[i] / accountsPayable[i];
            double debtorsCollectionPeriod = 365 / debtorsTurnoverRatio;
            double inventoryCollectionPeriod = 365 / inventoryTurnoverRatio;
            double payablesCollectionPeriod = 365 / payablesTurnoverRatio;
            double averageInventoryRatio = (inventory[i] + inventory[i]) / 2;
            System.out.println("Year " + (i + 1));
            System.out.println("Current ratio: " + currentRatio);
            System.out.println("Quick ratio: " + quickRatio);
            System.out.println("Absolute liquidity ratio: " + absoluteLiquidityRatio);
        }

        // Calculate profitability ratios and output results
        System.out.println("Profitability ratios:");
        for (int i = 0; i < numYears; i++) {
            double grossProfitMargin = (revenue[i] - costOfGoodsSold[i]) / revenue[i];
            double operatingProfitMargin = (revenue[i] - costOfGoodsSold[i] - operatingExpenses[i]) / revenue[i];
            double netProfitMargin = netIncome[i] / revenue[i];
            double assetTurnoverRatio = revenue[i] / ((currentAssets[i] + currentAssets[i]) / 2);
            double returnOnAssets = netIncome[i] / ((currentAssets[i] + currentAssets[i]) / 2);
            double returnOnEquity = (profit_after_Tax[i] - preference_dividend[i])/equity_share_capital[i];
            double noOfEquityShare = (share_capital[i] * faceValue[i])/parValueOfShare[i];
            System.out.println("Year " + (i + 1));
            System.out.println("net profit: " + net_profit);
            System.out.println("Gross profit margin: " + grossProfitMargin);
            System.out.println("Operating profit margin: " + operatingProfitMargin);
            System.out.println("Net profit margin: " + netProfitMargin);
            System.out.println("Asset turnover ratio: " + assetTurnoverRatio);
            System.out.println("Return On Assets: " + returnOnAssets);
            System.out.println("Return On Equity: " + returnOnEquity);
            System.out.println("No of equity share: " + noOfEquityShare);
        }
        // calculate solvency ratios and output results
        System.out.println("Solvency Ratios:");
        for (int i = 0; i < numYears; i++){
            double DebitToEquityRatio = LongTermDebt[i]/EquityShareHolderFunds[i];
            double solvencyRatio = TotalDebt[i]/TotalTangibleAssets[i];
            double protriataryRatio = ShareholdersNetwork[i]/TotalTangibleAssets[i];
            double fixedAssetRatio  = netFixedAsset[i]/netCapitalEmployed[i];
            double capitalEmployed = shareholdersFunds[i] + LongTermLiabilities[i];
            System.out.println("Year " + (i + 1));
            System.out.println("Debit to equity ratio: " + DebitToEquityRatio);
            System.out.println("Solvency Ratios: " + solvencyRatio);
            System.out.println("Protriatary Ratio: " + protriataryRatio);
            System.out.println("Fixed Asset Ratio: " + fixedAssetRatio);
            System.out.println("Capital Employed: " + capitalEmployed);

        }

        //Calculate coverage Ratio and output results
        System.out.println("Coverage Ratios and Market Related Ratios:");
        for (int i = 0; i < numYears; i++){
            double IntrestCoverageRatio = EarningsBeforeintrestAndTax[i]/intrest[i];
            double PreferenceDividendCoverageRatio = EarningsAfterTax[i]/preference_dividend[i];
            double PriceToEarnRatio = marketPrice[i]/earningsPerShare[i];
            double DividendPerShareRatio = dividend[i]/noOfEquityShares[i];
            double DividendYield = DividendPerShare[i]/marketPrice[i];
            System.out.println("Year " + (i + 1));
            System.out.println("Intrest Coverage Ratio: " + IntrestCoverageRatio);
            System.out.println("Preference Dividend Coverage Ratio: " + PreferenceDividendCoverageRatio);
            System.out.println("Price to earn Ratio: " + PriceToEarnRatio);
            System.out.println("Dividend per share Ratio: " + DividendPerShareRatio);
            System.out.println("Dividend Yield: " + DividendYield);
        }
    }
}
